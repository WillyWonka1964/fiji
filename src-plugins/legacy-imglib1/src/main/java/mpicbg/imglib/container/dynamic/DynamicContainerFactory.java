/*
 * #%L
 * ImgLib: a general-purpose, multidimensional image processing library.
 * %%
 * Copyright (C) 2009 - 2013 Stephan Preibisch, Tobias Pietzsch, Barry DeZonia,
 * Stephan Saalfeld, Albert Cardona, Curtis Rueden, Christian Dietz, Jean-Yves
 * Tinevez, Johannes Schindelin, Lee Kamentsky, Larry Lindsey, Grant Harris,
 * Mark Hiner, Aivar Grislis, Martin Horn, Nick Perry, Michael Zinsmaier,
 * Steffen Jaensch, Jan Funke, Mark Longair, and Dimiter Prodanov.
 * %%
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 * 
 * 1. Redistributions of source code must retain the above copyright notice,
 *    this list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 * 
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDERS OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 * 
 * The views and conclusions contained in the software and documentation are
 * those of the authors and should not be interpreted as representing official
 * policies, either expressed or implied, of any organization.
 * #L%
 */

package mpicbg.imglib.container.dynamic;

import mpicbg.imglib.container.DirectAccessContainer;
import mpicbg.imglib.container.DirectAccessContainerFactory;
import mpicbg.imglib.type.Type;

/**
 * TODO
 *
 * @author Stephan Preibisch
 */
public class DynamicContainerFactory extends DirectAccessContainerFactory
{
	@Override
	public <T extends Type<T>> DirectAccessContainer<T, BitDynamicContainerAccessor> createBitInstance( final int[] dimensions, final int entitiesPerPixel)
	{
		return new BitDynamicContainer<T>( this, dimensions, entitiesPerPixel );
	}

	@Override
	public <T extends Type<T>> DirectAccessContainer<T, ByteDynamicContainerAccessor> createByteInstance( final int[] dimensions, final int entitiesPerPixel)
	{
		return new ByteDynamicContainer<T>( this, dimensions, entitiesPerPixel );	}

	@Override
	public <T extends Type<T>> DirectAccessContainer<T, CharDynamicContainerAccessor> createCharInstance( final int[] dimensions, final int entitiesPerPixel)
	{
		return new CharDynamicContainer<T>( this, dimensions, entitiesPerPixel );	}

	@Override
	public <T extends Type<T>> DirectAccessContainer<T, DoubleDynamicContainerAccessor> createDoubleInstance( final int[] dimensions, final int entitiesPerPixel)
	{
		return new DoubleDynamicContainer<T>( this, dimensions, entitiesPerPixel );	}

	@Override
	public <T extends Type<T>> DirectAccessContainer<T, FloatDynamicContainerAccessor> createFloatInstance( final int[] dimensions, final int entitiesPerPixel)
	{
		return new FloatDynamicContainer<T>( this, dimensions, entitiesPerPixel );
	}

	@Override
	public <T extends Type<T>> DirectAccessContainer<T, IntDynamicContainerAccessor> createIntInstance( final int[] dimensions, final int entitiesPerPixel)
	{
		return new IntDynamicContainer<T>( this, dimensions, entitiesPerPixel );	}

	@Override
	public <T extends Type<T>> DirectAccessContainer<T, LongDynamicContainerAccessor> createLongInstance( final int[] dimensions, final int entitiesPerPixel)
	{
		return new LongDynamicContainer<T>( this, dimensions, entitiesPerPixel );	
	}

	@Override
	public <T extends Type<T>> DirectAccessContainer<T, ShortDynamicContainerAccessor> createShortInstance( final int[] dimensions, final int entitiesPerPixel)
	{
		return new ShortDynamicContainer<T>( this, dimensions, entitiesPerPixel );	}

	@Override
	public String getErrorMessage()
	{
		return null;
	}

	@Override
	public void printProperties()
	{
		
	}

	@Override
	public void setParameters(String configuration)
	{
		
	}

}
